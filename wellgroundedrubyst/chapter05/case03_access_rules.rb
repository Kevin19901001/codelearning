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
