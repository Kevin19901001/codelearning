class Publication
  attr_accessor :publisher
end

class Magzine < Publication
  attr_accessor :editor
end

magzine = Magzine.new
magzine.publisher = "David A. Black"
magzine.editor = "Joe Smith"
puts "Mag is published by #{magzine.publisher}, and edit by #{magzine.editor}."

class Ezine < Magzine
end