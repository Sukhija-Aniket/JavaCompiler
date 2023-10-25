#! /bin/bash

arg="$1"
var1="parse"
var2="clean"
var3="compile"
# var4="diff"

declare -a files
input_dir="testcases_input"
output_dir="testcases_output"

cd $input_dir
files=( $( ls . ) )
cd ../	
if [[ "$arg" == "$var1" ]]; then
	javac *.java
	rm -rf $output_dir
	mkdir $output_dir
	for file in "${files[@]}"
	do
		output_file="${output_dir}/${file%.*}.txt"
		echo "Generated file: ${output_file}"
		java Main < "${input_dir}/${file}" > "${output_file}"
	done

# elif [[ "$arg" == "$var4" ]]; then
# 	echo "Differences will be printed below"
# 	#cd testcases
# 	for directory in "${directories[@]}"
# 	do
# 		cd testcases/"${directory}"
# 		javac -cp . cs502/memmgr/*.java cs502/*.java #compiling
# 		java cs502.Test > cs502/input.txt 
# 		java cs502.Main > cs502/output.txt
# 		echo "${directory}\n"
# 		diff cs502/input.txt cs502/output.txt
# 		rm -rf cs502/*.class
# 		cd ../ 
# 		cd ../
# 	done
	
elif [[ "$arg" == "$var2" ]]; then
	echo "removing files"
	find . -name "*.class" -type f
	find . -name "*.class" -type f -delete
	# find . -name "*.jj" -type f 
	# find . -name "*.jj" -type f -delete
	# find . -name "*.jar" -type f
	# find . -name "*.jar" -type f -delete
	find . -name "*.iml" -type f 
	find . -name "*.iml" -type f -delete
	find . -name "*.txt" -type f
	find . -name "*.txt" -type f -delete
	find . -name "*.html" -type f 
	find . -name "*.html" -type f -delete
	rm -rf $output_dir


elif [[ "$arg" == "$var3" ]]; then
	javacc Javagrammer.jj
	java -jar jtb132.jar Javagrammer.jj
	javacc jtb.out.jj

else
	echo "valid commands are: parse, clean and compile"
fi
