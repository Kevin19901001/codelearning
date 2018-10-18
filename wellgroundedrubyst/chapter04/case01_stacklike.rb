module Stacklike
  def stack
    @stack ||= []
  end

  def add_to_stack(obj)
    stack << obj
  end

  def take_from_stack
    @stack.pop
  end
end
