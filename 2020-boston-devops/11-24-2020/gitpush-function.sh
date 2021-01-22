function gitpush(commitMessage) {
	git add .
	git commit -m $commitMessage
	git push -u origin master
}

export -f gitpush