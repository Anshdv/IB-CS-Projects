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
| `String.length()` | Accessor | |
| `String.replace()` | | |
| `String.trim()` | | |
| `String.concat()` | | |
| `String.substring()` | | |
| `StringBuilder.length()` | | |
| `StringBuilder.append()` | | |
| `StringBuilder.insert()` | | |
| `StringBuilder.reverse()` | | |
| `StringBuilder.toString()` | | |
| `Rectangle.getWidth()` | | |
| `Rectangle.setSize()` | | |
| `Rectangle.grow()` | | |
| `Rectangle.intersection()` | | |
| `Rectangle.contains()` | | |

## Object diagram

Add your diagram file to this folder and name it here:

**File:**

**How many objects exist when that code finishes?**

## Commit log

You need at least four commits with real messages. Check yours with:

```
git log --oneline
```
