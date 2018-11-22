class Cake
  def initialize(batter)
    @batter = batter
    @baked = true
  end
end

class Egg
end

class Flour
end

class Baker
  def bake_cake
    @batter = []
    pour_flour
    add_egg
    stir_batter
    return Cake.new(@batter)
  end

  def pour_flour
    @batter.push(Flour.new)
    puts "Flour has been poured!"
  end

  def add_egg
    @batter.push(Egg.new)
    puts "Eggs have been added!"
  end

  def stir_batter
  end

  private :pour_flour, :add_egg, :stir_batter
end

b = Baker.new
#b.add_egg	# private method `add_egg' called for #<Baker:0x007fd6e11893d0> (NoMethodError)
b.bake_cake	# Flour has been poured! Eggs have been added!


class Dog
  attr_reader :age, :dog_years

  def age=(years)
    @age = years
    #dog = self
    #dog.dog_years = years	# private method `dog_years=' called for ...
    self.dog_years = years * 7
  end

  def dog_years=(years)
    @dog_years = years
  end

  private :dog_years=
end

rover = Dog.new
rover.age = 10
puts "Rover is #{rover.dog_years} in dog years."


# Protected methods:
class C
  def initialize(n)
    @n = n
  end

  def n
    @n
  end

  def compare(c)
    if c.n > n
      puts "The other object's n is bigger."
    else
      puts "The other object's n is the same or smaller."
    end
  end

  protected :n
end

c1 = C.new(100)
c2 = C.new(101)
c1.compare(c2)
