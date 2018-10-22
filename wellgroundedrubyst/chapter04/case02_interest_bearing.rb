# Multiple definition methods as the same name.
module InterestBearing
  
  def calculate_interest
    puts "Placeholder! We are in module InterestingBearing!"
  end

end

class BankAccount

  include InterestBearing

  def calculate_interest
    puts "Placeholder! We are in class BankAccount!"
    print "And we are overriding the calculate_interest method "
    puts "which was defined in the InterestBearing module."
  end

end

account = BankAccount.new
account.calculate_interest


# Mix in multiple modules which have the same name methods
module M

  def report
    puts "'report' method in module M"
  end

end

module N

  def report
    puts "'report' method in module N"
  end

end

class C
  
  include M

  include N

end

c = C.new
c.report

class C

  include M

  include N

  include M

end

c = C.new
c.report	# 'report' method in module N
