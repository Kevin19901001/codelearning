require "rbconfig"

# Ruby命令行工具
puts RbConfig::CONFIG["bindir"]

# Ruby标准库  
puts RbConfig::CONFIG["rubylibdir"]
  
# 特定架构的扩展和库文件（已编译，二进制文件）
puts RbConfig::CONFIG["archdir"]
  
# 用户自己或第三方扩展库文件（用Ruby编写）
puts RbConfig::CONFIG["sitedir"]
  
# 第三方扩展和库文件（用Ruby编写）
puts RbConfig::CONFIG["vendordir"]
  
# 用户自己的Ruby语言扩展（用Ruby语言编写）
puts RbConfig::CONFIG["sitelibdir"]
  
# 用户自己的Ruby语言扩展（用C语言编写）
puts RbConfig::CONFIG["sitearchdir"]