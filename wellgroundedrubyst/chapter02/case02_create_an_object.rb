# Create an object:
ticket = Object.new

# Give behaviors and data to object:
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

# Query Ticket object:
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


# Reduce codes through string interpolation:
puts "This ticket is for #{ticket.event}, at #{ticket.venue}, on #{ticket.date}." +
     "The performer is #{ticket.performer}." +
     "The seat is #{ticket.seat}, " +
     "and it costs $#{"%.2f." % ticket.price}"
	 

# Express boolean state by method:
def ticket.available?
  false
end

if ticket.available?
  puts "You're in luck!"
else
  puts "Sorry--that seat has been sold!"
end


# True and false value:
if puts "You'll see that."									
  puts "But not that."		# It indicates that 'puts' returns nil, and nil presents false.
end
