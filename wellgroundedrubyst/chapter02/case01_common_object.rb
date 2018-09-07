# 创建通用对象
obj = Object.new

# 定义对象的行为
def obj.talk
  puts "I am an object."
  puts "Do you object?"
end

obj.talk


# 带参数的方法
def obj.c2f(c)
  c * 9.0 / 5 + 32
end

puts obj.c2f(100)