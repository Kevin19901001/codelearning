file = "H:\\codelearning\\wellgroundedrubist\\chapter01\\temp.dat"
puts "Reading Celsius temperature value from data file..."
num = File.read(file)

celsius = num.to_i
fahrenheit = (celsius * 9 / 5) + 32
print "The num is " + num + "\n"
print "Result: "
puts fahrenheit