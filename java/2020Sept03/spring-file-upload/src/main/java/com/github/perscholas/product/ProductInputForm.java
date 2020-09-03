package com.github.perscholas.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by leon on 9/3/2020.
 */
@Controller
public class ProductInputForm {

    @RequestMapping(value = "/product-input-form", method = RequestMethod.GET)
    public String inputProduct(Model model) {
        model.addAttribute("product", new Product());
        return "productForm";
    }

    @PostMapping("/save-product")
    public String fileUpload(
            @RequestParam("images") MultipartFile[] files,
            Model model,
            Product product,
            RedirectAttributes redirectAttributes) throws IOException {
        String uploadDir = "/Users/CTAdmin/dev/multipart-file-upload";
        for (MultipartFile file : files) {
            if (!file.getOriginalFilename().isEmpty()) {
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(new File(uploadDir, file.getOriginalFilename())));
                outputStream.write(file.getBytes());
                outputStream.flush();
                outputStream.close();
            } else {
                String flashAttributeVariable = "msg";
                String flashAttributeValue = "Please select at least one file...";
                redirectAttributes.addFlashAttribute(flashAttributeVariable, flashAttributeValue);
                return "redirect:/product-input-form";
            }
        }
        model.addAttribute("msg", "Multiple files uploaded successfully.");
        model.addAttribute("product", product);
        return "viewProductDetail";
    }
}
