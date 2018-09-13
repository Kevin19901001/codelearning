# The original behaviours of an object
p Object.new.methods.sort

# object_id
obj = Object.new
puts "The id of obj is #{obj.object_id}."

str = "Strings are objects too, and this is a string!"
puts "The id of string object str is #{str.object_id}."