directoryName=$1

mkdir $directoryName

condition="[ -d $directoryName ]"

if $condition; then
	echo "Hello world"
fi