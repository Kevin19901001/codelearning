class Person

  def self.method_missing(m, *args)

  end

end

j = Person.new("Jhon")
p = Person.new("Pual")
g = Person.new("Geroge")
r = Person.new("Ringo")
j.has_friend(p)
j.has_friend(g)
g.has_friend(p)
r.has_hobby("rings")
Person.all_with_friends(p).each do |person|
  puts "#{person.name} is friends with #{p.name}"
end

Person.all_with_hobbies("rings") do |person|
  puts "#{persn.name} is into rinds."
end
