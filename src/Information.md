- Kotlin has a special feature i.e. classes and methods are not open for extension by default, which means they are by
  default final class or final function. It means **Open classes and methods** in Kotlin are equivalent to the opposite
  of
  final in Java, an open method is overridable and an open class is extendable in Kotlin.

- **Operator overloading**

```
* Operator overloading can be done with the following method names -
*
* a * b times
* a / b div
* a % b mod
* a + b plus
* a - b minus
*
* precedence still follows the default rule. Also applies to unary operator
*
* +a      unaryPlus
* -a      unaryMinus
* !a      not
* ++a, a++ inc
* --a, a-- dec
```

- A **Higher Order Function** is a function that takes another function as an argument or returns one.

- **Type parameters** Lets a generic class what type to use. For example, `List<String>` has a type paramter `String`.

- **Type arguments** When an instance of a class with type parameters are instantiated, they are replaced with the type
  arguments. For example, the Map class has type parameters for the key type and the value type: class Map<K, V>. We can
  instantiate it with specific arguments: Map<String, Person>.

- **Type Erasure** is where the type arguments of an instance of a generic class are not preserved at runtime. This
  means a `List<String>` and a `List<Int>` are both just Lists at runtime. It's the compiler who does the check of what
  values go in the compile time.

- **Reified type parameters** allow you to refer at runtime to the specific types used as type arguments in an inline
  function call. (For normal classes or functions, this isn’t possible, because type arguments are erased at runtime.)
  This works only for inline since at runtime, the bytecode for the generics gets replaced by the inlined Type argument.

- **Declaration-site variance** lets you specify whether a generic type with a type argument is a subtype or a supertype
  of another generic type with the same base type and a different type argument. For example, it regulates whether it’s
  possible to pass arguments of type `List<Int>` to functions expecting `List<Any>`. **Use-site variance** achieves the
  same
  goal for a specific use of a generic type and therefore accomplishes the same task as Java’s wildcards.

- **Type parameter constraints** let you restrict the types that can be used as type arguments for a class or function
  by specifying an **upper bound**.

- The concept of **variance** describes how types with the same base type and different type arguments relate to each
  other: for example, `List<String>` and `List<Any>`. It is safe to pass a list of strings to a function that expects a
  list of Any objects. It’s not safe if the function
  adds or replaces elements in the list, because this creates the possibility of type inconsistencies.

- **Invariant class** is the normal generic class. Example `MutableList<T>`

- A **covariant class** is a generic class (we’ll use Producer<T> as an example) for which the following holds:
  Producer<A> is a subtype of Producer<B> if A is a subtype of B. We say that the **subtyping is preserved**.

- A class that is **contravariant** on the type parameter is a generic class (let’s consider Consumer<T> as an example)
  for which the following holds: Consumer<A> is a subtype of Consumer<B> if B is a subtype of A. The type arguments A
  and B changed places, so we say the subtyping is reversed. For example, `Consumer<Animal>` is a subtype of
  `Consumer<Cat>`.