# method_missing

class Student

  def method_missing(m, *args)
    if m.to_s.start_with?("grade_for")
      puts "haha"
    else
      super
    end
  end
end
