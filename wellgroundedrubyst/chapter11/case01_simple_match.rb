# Simple match:
# Regular expression literal:
puts //.class								# Regexp


# The difference between calling from string and calling from regexp is that calling from string 
# would convert string into regexp.
puts "Match!" if /abc/.match("The alphabet starts with abc.")		# Match!
puts "Match!" if "The alphabet starts with abc".match(/abc/)		# Match!


# Excepting method 'match', the operator '=~' is the same use.
puts "Match!" if /abc/ =~ "The alphabet starts with abc."		# Match!
puts "Match!" if "The alphabet starts with abc." =~ /abc/		# Match!


# The difference between 'match' and '=~' is the returned values: 'match' returns an instance of
# class 'MatchData'; '=~' returns an index of the matched position.
p "The alphabet starts with abc." =~ /abc/				# 25
p /abc/.match("The alphabet starts with abc.")				# #<MatchData "abc"
