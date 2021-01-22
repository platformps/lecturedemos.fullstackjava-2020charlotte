package com.github.perscholas.lecture2;

import com.github.perscholas.lectureutils.LocalHomeDirectoryReference;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

/**
 * Created by leon on 8/10/2020.
 */
public class NIOEx1 {
    public static void main(String[] args) throws IOException {
        String nameOfInputFile = LocalHomeDirectoryReference.DOCUMENTS.getFileName("/sample-in.txt");
        String nameOfOutputFile = LocalHomeDirectoryReference.DOCUMENTS.getFileName("/sample-out.txt");
        FileInputStream input = new FileInputStream(nameOfInputFile);
        FileOutputStream output = new FileOutputStream(nameOfOutputFile);

        ReadableByteChannel source = input.getChannel();
        WritableByteChannel destination = output.getChannel();
        copyData(source, destination);
        source.close();
        destination.close();
    }

    private static void copyData(ReadableByteChannel source, WritableByteChannel destination) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocateDirect(20 * 1024);
        while (source.read(buffer) != -1) {
            buffer.flip(); // The buffer is used to drained
            // ensure that buffer was fully drained
            while (buffer.hasRemaining()) {
                destination.write(buffer);
            }
            buffer.clear();
        } // Now buffer is empty, ready for filling
    }
}
