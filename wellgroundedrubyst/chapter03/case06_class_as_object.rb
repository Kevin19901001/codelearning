# Classes are object, they just objects which have ability t generate objects.
my_class = Class.new
instance_of_my_class = my_class.new

c = Class.new do
  def say_hello
    puts "Hello!"
  end
end
c.new.say_hello

# How class as object to call methods
# 1. From their class
# Ticket is one instance of Class, and Class ahs defined an instance method 'new'. So there is:
Ticket.new

# 2. From their super classes or ancestors
# Class's super class is Module. So Class's instances like Ticket can call the methods which defined in Module.
# Ticket as 'self' t call these methods:
class Ticket
  attr_reader :date, :venue
  attr_accessor :price
end

# 3. From single instance methods which stored in theirselves.
class Ticket
  def Ticket.most_expensive(*tickets)
    tickets.max_by(&:price)
  end
end