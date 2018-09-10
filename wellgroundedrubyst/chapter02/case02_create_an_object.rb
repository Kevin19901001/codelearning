# 制作一个对象
ticket = Object.new

# 给ticket对象赋予属性和数据
def ticket.date
  "01/02/03"
end

def ticket.venue
  "Town Hall"
end

def ticket.event
  "Author's reading"
end

def ticket.performer
  "Mark Twain"
end

def ticket.seat
  "Second Balcony, row J, seat 12"
end

def ticket.price
  5.5
end

# 查询ticket对象
# print "This ticket is for: "
# print ticket.event + ", at "
# print ticket.venue + ", on "
# puts ticket.date + "."
# print "The performer is "
# puts ticket.performer + "."
# print "The seat is "
# print ticket.seat + ", "
# print "and it costs $"
# puts "%.2f." % ticket.price


# 通过字符串插值缩短代码
puts "This ticket is for #{ticket.event}, at #{ticket.venue}, on #{ticket.date}." +
     "The performer is #{ticket.performer}." +
     "The seat is #{ticket.seat}, " +
     "and it costs $#{"%.2f." % ticket.price}"
	 

# 用方法表达布尔状态
def ticket.available?
  false
end

if ticket.available?
  puts "You're in luck!"
else
  puts "Sorry--that seat has been sold!"
end


# 真值和假值
if puts "You'll see that."																# 说明puts返回的是nil，而nil为假值。
  puts "But not that."
end