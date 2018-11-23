# The original behaviours of an object:
p Object.new.methods.sort

# object_id
obj = Object.new
puts "The id of obj is #{obj.object_id}."

str = "Strings are objects too, and this is a string!"
puts "The id of string object str is #{str.object_id}."
puts "And the id of the integer 100 is #{100.object_id}."

# Although variable 'a' and variable 'b' are different,
# but they refer to the same object, 
# so their object id is the same. They are the sameobject.
a = Object.new
b = a
puts "a's id id #{a.object_id} and b's id is #{b.object_id}."

# Some times, two object look like the same, but they are different objects.
string1 = "hello"
string2 = "hello"
puts "string1's id is #{string1.object_id}."                                  # 23535380
puts "string2's id is #{string2.object_id}."                                  # 23535360

# Use method 'respond_to?' to query the ability of an object.
# This method suits to any object.
obj = Object.new
#obj.talk                                                                      # NoMethodError

obj = Object.new
if obj.respond_to?("talk")
  obj.talk
else
  puts "Sorry, the object doesn't understand the 'talk' message!"
end

# Use method 'send' to send message to an object.
#request = gets.chomp
#ticket = Object.new
#if ticket.respond_to?(request)
#  puts ticket.send(request)
#else
#  "No such information available."
#end
