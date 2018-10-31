$gvar = "T'm a global!"
class C

  def exam_global
    puts $gvar
  end

end

c  = C.new
c.exam_global
