module MyFirstModule
  def say_hello
    puts "hello"
  end
end

class ModuleTester
  include MyFirstModule
end

mt = ModuleTester.new
mt.say_hello()

module Stacklike
  def stack
    @stack |= []
  end

  def add_to_stack(obj)
    stack << obj
  end

  def take_from_stack
    stack.pop
  end
end
