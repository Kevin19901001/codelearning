# super

module M

  def report
    puts "'report' method in module M"
  end

end

class C

  include M

  def report
    puts "'report' method in class C"
    puts "About to trigger the next higher-up report method..."
    super
    puts "Back from the 'super' call."
  end

end

c = C.new
c.report


class Bicycle

  attr_reader :gear, :wheels, :seats

  def initialize(gears)
    @wheels = 2
    @seats = 1
    @gears = gears
  end

end

class Tandem < Bicycle

  def initialize(gears)
    super
    @gears = gears
  end

end
