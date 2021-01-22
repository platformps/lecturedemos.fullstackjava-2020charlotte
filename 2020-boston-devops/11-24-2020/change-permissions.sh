directoryName="~/dev/`date`" # create a unique name

mkdir $directoryName # make directory with unique name
cd $directoryName # change current working directory
ls # echo contents of current directory

touch some-file # create file with name `some-file`
ls -l # echo contents of current directory with user permissions on each file

chmod u+x ./some-file # change permissions of `some-file` to add executable to usergroup	
ls -l # echo contents of current directory to verify permissions have changed

pwd # displays presently working directory