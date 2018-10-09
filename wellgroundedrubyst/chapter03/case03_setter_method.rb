# Setter
class Ticket
  def price=(amount)
    if (amount * 100).to_i == amount * 100
      @price = amount
    else
      puts "The price seems to be malformed."
    end
  end
  
  def price
    @price
  end
end

class TravelAgentSession
  def year=(y)
    @year = year.to_i
    if year < 100
      @year = @year + 2000
    end
  end
end