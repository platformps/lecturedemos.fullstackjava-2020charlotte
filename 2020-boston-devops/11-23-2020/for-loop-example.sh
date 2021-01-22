NAMES="Alice Bob Charles"
for name in $NAMES; do
	echo "Hello $name"
done


# prints everything in the current directory
for FILE in *; do
	ls -l $FILE
done