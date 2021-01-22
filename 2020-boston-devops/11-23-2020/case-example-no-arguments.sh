case "$GREETING" in
	hello|hi)
		echo "hello yourself"
		;;

	goodbye)
		echo "nice to have met you"
		echo "I hope to see you again"
		;;

	*)
		echo "I didn't understand that"
esac