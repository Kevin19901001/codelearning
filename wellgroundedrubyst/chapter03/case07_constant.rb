class Ticket
  VENUES = ["Convention Center", "Hall Town", "Fairgrounds"]
  def initialize(venue, date)
    if VENUES.include?(venue)
      @venue = venue
    else
      raise ArgumentError, "Unknown venue #{venue}"
    end
    @date = date
  end
end

puts Ticket::VENUES
puts Math::E

# Constant can be changed
Ticket::VENUES << "High School Gym"
puts Ticket::VENUES