print "Hello. Please enter a Celsius value: "
celsius = gets.to_i
fahrenheit = (celsius * 9 / 5) + 32
puts "Saving result to output file 'temp.out'..."
# fh = File.new("H:\\codelearning\\wellgroundedrubist\\chapter01\\temp.out", "w")	# In windows
fh = File.new("temp.out", "w")								# In linux
fh.puts(fahrenheit.to_s)
fh.close
puts "Finished!"
