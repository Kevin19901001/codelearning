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


# load命令总是会加载所请求的文件，不论这个文件是否已经加载过。加入一个
# 文件在几次加载过程中发生改变，那么最新版本的文件将优先使用并覆盖之前
# 加载的版本。尤其是在irb会话中，当在编辑器中修改一个文件时，想要立刻
# 测试修改的效果，这将非常有用。


# 另一个加载文件的方法是require，它同样也搜索默认的加载路径中的目录。
# 但是require有一些load不具有的特点。最大的不同在于，require就算
# 调用多次，也不会重新加载已加载过的文件。Ruby会持续追踪已经被请求的
# 那些文件而不会重复加载它们。require比起load来说更为抽象。严格来说
# 是不能请求一个文件的，而只能请求一个功能。一般来说，做到这一点甚至不
# 用指定文件的扩展名。
