# The Mutation Investigation

Name:
Period:

## Classification table

Fill in one row per method you tested. The third column must cite **your own
assertion** — not what the documentation says.

| Method | Accessor or mutator | The assertion that proves it |
|---|---|---|
| `String.toUpperCase()` | Accessor | `assertEquals("Mississippi", river)` still passes after the call |
| `Rectangle.translate()` | Mutator | `assertEquals(20, box.getX())` — the original changed |
| `String.length()` | Accessor | `assertEquals(trueLength, river.length())` — returns the length without changing the string |
| `String.replace()` | Accessor | `assertEquals("Mississippi", river)` still passes after the call |
| `String.trim()` | Accessor | `assertEquals("  Hello, Space !  ", helloSpaced)` still passes after the call |
| `String.concat()` | Accessor | `assertEquals("Hello", hello)` still passes after the call |
| `String.substring()` | Accessor | `assertEquals("Mississippi", river)` still passes after the call |
| `StringBuilder.length()` | Accessor | `assertEquals("Mississippi", sb.toString())` still passes after the call |
| `StringBuilder.append()` | Mutator | `assertEquals("Hello, World", sb.toString())` — the original changed |
| `StringBuilder.insert()` | Mutator | `assertEquals("Oh, Hello", sb.toString())` — the original changed |
| `StringBuilder.reverse()` | Mutator | `assertEquals("stressed", sb.toString())` — the original changed |
| `StringBuilder.toString()` | Accessor | `assertEquals("Hello", sb.toString())` still passes after the call |
| `Rectangle.getWidth()` | Accessor | `assertEquals(20, width)` — returns the width without changing the rectangle |
| `Rectangle.setSize()` | Mutator | `assertEquals(40, box.getWidth())` — the original changed |
| `Rectangle.grow()` | Mutator | `assertEquals(30, box.getWidth())` — the original changed |
| `Rectangle.intersection()` | Accessor | `assertEquals(duplicateOfBox1, box1)` still passes after the call |
| `Rectangle.contains()` | Accessor | `assertEquals(true, containsTenTwenty)` — returns a boolean without changing the rectangle |

## Object diagram

Add your diagram file to this folder and name it here:

**File:**

**How many objects exist when that code finishes?**

## Commit log

You need at least four commits with real messages. Check yours with:

```
anshd@MacBook-Pro MutationInvestigation % git log --oneline
d25e002 (HEAD -> main, origin/main, origin/HEAD) added JavaDoc to stringbuilder
bddb7f9 finished readme and stringbuilder
3179c9e finished RectangleTest class
2be9ffb comments edit
5c1ceb6 added JavaDoc to StringTest
dc3ba07 finished StringTest class
a36e245 two String tests
833b932 Initial commit
```
