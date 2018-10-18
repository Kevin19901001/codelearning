require_relative "case01_stacklike"

class Suitecase
end

class Cargohold
  include Stacklike
  
  def load_and_report(obj)
    #p self    # self is ch
    print "Loading object: "
    puts obj.object_id
    add_to_stack(obj)
  end

  def unload
    #p self    # self is ch
    take_from_stack
  end
end

ch = Cargohold.new
sc1 = Suitecase.new
sc2 = Suitecase.new
sc3 = Suitecase.new
ch.load_and_report(sc1)
ch.load_and_report(sc2)
ch.load_and_report(sc3)
first_unloaded = ch.unload
print "The first suitecase off the plane is : "
puts first_unloaded.object_id
