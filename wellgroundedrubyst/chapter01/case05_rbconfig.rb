require "rbconfig"

# Ruby command line tools:
puts RbConfig::CONFIG["bindir"]

# Ruby standard lib:
puts RbConfig::CONFIG["rubylibdir"]
  
# Special architecture（compiled，binary files）
puts RbConfig::CONFIG["archdir"]
  
# User's own or third extensions lib files（written by Ruby）:
puts RbConfig::CONFIG["sitedir"]
  
# Third extensions and lib files(witten by Ruby):
puts RbConfig::CONFIG["vendordir"]
  
# User's own Ruby language extensions(written by Ruby）:
puts RbConfig::CONFIG["sitelibdir"]
  
# User's own Ruby language extensions(written by C):
puts RbConfig::CONFIG["sitearchdir"]
