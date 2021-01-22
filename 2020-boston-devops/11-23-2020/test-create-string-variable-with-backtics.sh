directoryName=a-new-directory

condition="[ -d $directoryName ]"

echo $condition

if `$condition`; then
	echo "$directoryName exists"
fi