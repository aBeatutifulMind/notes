# Basic stuff

### var and function
JS: var, function

PHP: $, function

### array
JS: 1. var x = [...] 2. var x = new Array()

PHP: 1. $x = array()

### object
JS: var X = {key: value, key: value}

PHP: $X = array(key=>value, ...)

### date
JS:

`- new Date()
- new Date(year, month, day, hours, minutes, seconds, milliseconds)
- new Date(milliseconds)
- new Date(date string)
`


PHP:
`data(), mktime(), strtotime()`

### constants
JS: const a = 'a'
PHP: define(name, value, case-insensitive)



### class
JS:

// the keywords var and function ain't used in a class definition
class ClassName {
  constructor(arg) {
    // do not need the keyword var
    this.attribute = arg;
    }
  get cnam() {
      return this.carname;
    }
}


PHP:

class Fruit {
  // Properties
  public $name;
  public $color;

  function __construct($name) {
    $this->name = $name;
  }

  function __destruct() {
    echo "The fruit is {$this->name}.";
  }

  // Methods
  function set_name($name) {
    $this->name = $name;
  }
  function get_name() {
    return $this->name;
  }
}

### forms
