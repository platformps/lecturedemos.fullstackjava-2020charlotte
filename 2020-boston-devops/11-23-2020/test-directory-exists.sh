directoryName=some-existent-directory

mkdir $directoryName

condition="[ -d $directoryName ]"

if $condition; then
	echo "Hello world"
fi