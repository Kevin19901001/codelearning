# prepend

module MeFirst

  def report
    puts "Hello from module!"
  end

end

class Person

  #prepend MeFirst

  def report
    puts "Hello from class!"
  end

  #prepend MeFirst
  
  include MeFirst

end

p = Person.new
p.report	# Hello from module!

p Person.ancestors
