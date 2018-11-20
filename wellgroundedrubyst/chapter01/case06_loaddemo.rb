# Load external files and extensions:
puts "This is the first (master) program file."
#load "H:\\codelearning\\wellgroundedrubist\\chapter01\\case07_loadee.rb"     # ok
#load "H:\\codelearning\\wellgroundedrubist\\chapter01\\case07_loadee"        # error
#require "H:\\codelearning\\wellgroundedrubist\\chapter01\\case07_loadee.rb"  # ok
#require "H:\\codelearning\\wellgroundedrubist\\chapter01\\case07_loadee"     # ok
#require "case07_loadee.rb"                                                   # error
#require "./case07_loadee.rb"                                                 # error
#require_relative "./case07_loadee.rb"                                        # ok
require_relative "case07_loadee.rb"                                           # ok
#$: << "."
#require "case07_loadee.rb"                                                   # error
puts "And back again to the first file."

# The current file
puts __FILE__

# The file in default loading path:
puts $:


# Note: remember that 'load' is a methd, in program files, it just running when ruby meets it.
# Ruby would not search the whole directory to execute 'oad' command. It is said, when ruby 
# inpretor meet it, it will find the file to load. It means the file to be loaded can be decided 
# dynamically, even in 'if' condition.


# Command 'load' would always load the requiring file, however they have been loaded.
# If a file was changed in loading, then the newest version would override the files loaded before.


# Another way to load a file is method 'require', it search the default loading path as the same.
# But the biggest difference is that 'require' would not require a file again which has been 
# required. 'require' is more abstract than 'load', require a function, load a file.
