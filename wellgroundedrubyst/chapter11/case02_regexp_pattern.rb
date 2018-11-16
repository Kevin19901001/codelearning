# When writing a regular expression, the definition of pattern was between '/' and '/'.

# 1. Char word in pattern:
/a/
/\?/


# 2. Common matching symbol '.':
puts "Match!" if /.ejected/.match("%ejected")           # Match


# 3. Char class:
/[dr]ejected/
/[a-z]/
/[A-Fa-f0-9]/
string = "ABC3934 is a hex number."
puts string =~ /[^A-Fa-f0-9]/				# 7
