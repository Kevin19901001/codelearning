# Global scope
$gvar = "T'm a global!"
class C

  def exam_global
    puts $gvar
  end

end

c  = C.new
c.exam_global


# Local scope
a = 0

def t
  puts "Top level method t"
end

class C

  a = 1

  def self.x
    a = 2
    puts "C.x; a = #{a}"
  end

  def m
    a = 3
    puts "C#m; a = #{a}"
  end

  def n
    a = 4
    puts "C#n; a = #{a}"
  end

  puts "Class scope: a = #{a}"

end

C.x
c = C.new
c.m
c.n

puts "Top level: a = #{a}"


# Local scope and self
class C

  def x(value_for_a, recurse=false)
    a = value_for_a
    print "Here's the object id for 'self':"
    puts self.object_id
    puts "And here's a:"
    puts a
    if recurse
      puts "Calling myself (recursion)..."
      x("Second value for a")
      puts "Back after recursion; here's a:"
      puts a
    end
  end

end
c = C.new
c.x("First value for a", true)
