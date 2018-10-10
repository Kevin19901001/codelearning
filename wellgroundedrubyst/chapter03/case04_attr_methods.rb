# Use attr_accessor to create reader and writer attributes
class Ticket
  attr_reader :date, :venue
  attr_accessor :price
  
  def initialize(date, venue, price)
    @date = date
    @venue = venue
    @price = price
  end
end

ticket = Ticket.new("11/12/13", "Hall Town", 65.5)
puts ticket.date()
puts ticket.venue()
puts ticket.price()