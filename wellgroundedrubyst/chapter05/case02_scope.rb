# Global scope
$gvar = "T'm a global!"
class C

  def exam_global
    puts $gvar
  end

end

c  = C.new
c.exam_global


# Local scope
a = 0

def t
  puts "Top level method t"
end

class C

  a = 1

  def self.x
    a = 2
    puts "C.x; a = #{a}"
  end

  def m
    a = 3
    puts "C#m; a = #{a}"
  end

  def n
    a = 4
    puts "C#n; a = #{a}"
  end

  puts "Class scope: a = #{a}"

end

C.x
c = C.new
c.m
c.n

puts "Top level: a = #{a}"


# Local scope and self
class C

  def x(value_for_a, recurse=false)
    a = value_for_a
    print "Here's the object id for 'self':"
    puts self.object_id
    puts "And here's a:"
    puts a
    if recurse
      puts "Calling myself (recursion)..."
      x("Second value for a")
      puts "Back after recursion; here's a:"
      puts a
    end
  end

end
c = C.new
c.x("First value for a", true)


# Class variable cross over class and instance:
class Car

  @@makes = []
  @@cars = {}
  @@total_count = 0

  attr_reader :make

  def self.total_count
    @@total_count
  end

  def self.add_make(make)
    unless @@makes.include?(make)
      @@makes << make
      @@cars[make] = 0
    end
  end

  def initialize(make)
    if @@makes.include?(make)
      puts "Creating a new #{make}!"
      @make = make
      @@cars[make] += 1
      @@total_count += 1
    else
      raise "No suck make: #{make}!"
    end
  end

  def make_mates
    @@cars[self.make]
  end
end

Car.add_make("Honda")
Car.add_make("Ford")
h = Car.new("Honda")
f = Car.new("Ford")
h2 = Car.new("Honda")

puts "Counting cars as same make of h2..."
puts "There are #{h2.make_mates}."

puts "Counting total cars..."
puts "There are #{Car.total_count}."

# x = Car.new("Brand X")	# No such make... RunTimeError


# Class variable and class hierarchy:
class Parent

  @@value = 100

end

class Child < Parent

  @@value = 200

end

class Parent

  puts @@value

end


# Use instance variable of class object to maintain every objects' state:
class Car

  @@makes = []
  @@cars = {}
  attr_reader :make

  def self.total_count
    @total_count |= 0
  end

  def self.total_count=(n)
    @total_count = n
  end

  def self.add_make(make)
    unless @@makes.include?(make)
      @@makes << make
      @@cars[make] = 0
    end
  end

  def initiaize(make)
    if @@makes.include?(make)
      puts "Creating a new car #{make}!"
      @make = make
      @@cars[make] += 1
      self.class.total_count += 1
    else
      raise "No such make: #{make}!"
    end
  end

  def make_mates
    @@cars[self.make]
  end

end

class Hybrid < Car

end

h3 = Hybrid.new("Honda")
f2 = Hybrid.new("Ford")
puts "There are #{Hybrid.total_count} hybrids on road."
