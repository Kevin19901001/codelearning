obj = Object.new
# Just one argument
def obj.one_arg(x)
  puts "I required one and only one argument!"
end
#obj.one_arg(1, 2, 3)                            # wrong number of arguments (3 for 1) (ArgumentError)

# Zero or more arguments
def obj.multi_args(*x)
  puts "I required zero or more arguments!"
end

# Two or more arguments
def two_or_more(a, b, *c)
  puts "I required two or more arguments!"
  puts "And sure enough, I got!"
  p a, b, c
end
two_or_more(1, 2, 3, 4, 5)

# Default value of argument
def default_args(a, b, c=1)
  puts "Values of variables: ", a, b, c
end
default_args(3, 2)

# Order of formal args and real args
def mixed_args(a, b, *c, d)
  puts "Arguments:"
  p a, b, c, d
end
mixed_args(1, 2, 3, 4, 5)
mixed_args(1, 2, 3)

def args_unreleashed(a, b=1, *c, d, e)
  puts "Arguments:"
  p a, b, c, d, e
end
args_unreleashed(1, 2, 3, 4, 5)
args_unreleashed(1, 2, 3, 4)
args_unreleashed(1, 2, 3)
args_unreleashed(1, 2, 3, 4, 5, 6, 7, 8)
#args_unreleashed(1, 2)                           # wrong number of arguments (2 for 3+) (ArgumentError)

