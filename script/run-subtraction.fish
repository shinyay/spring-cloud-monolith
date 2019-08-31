#!/usr/bin/env fish

function run_subtraction
  argparse -n run_subtraction 'h/help' 'l/library=' -- $argv
  or return 1

  if set -lq _flag_help
    echo "run-subtraction.fish -l/--library <APP_JAR>"
    return
  end

  set -lq _flag_library
  or set -l _flag_library ../build/libs/lb-eureka-0.0.1-SNAPSHOT.jar

  java -jar $_flag_library subtraction
end

run_subtraction $argv
