def say_goodbye
  x = "Goodbye"
  puts x                                            # Goodbye
end

def start_here
  x = "Hello"
  puts x                                            # Hello
  say_goodbye
  puts "Lets check whether x remained the same:"
  puts x                                            # Hello
end

start_here


# Variable, object and quote
def say_goodbye
  str = "Hello"
  abc = str
  str.replace("Goodbye")
  puts str                                          # Goodbye
  puts abc                                          # Goodbye
end
say_goodbye

def say_goodbye
  str = "Hello"
  abc = str
  abc.replace("Goodbye")
  puts str                                          # Goodbye
  puts abc                                          # Goodbye
end
say_goodbye


# Revalue
str = "Hello"
abc = str
str = "Goodbye"
puts str                                            # Goodbye
puts abc                                            # Hello