# Kotlin DSL & Groupie

Kotlin DSL and Groupie go well together.

## How

```kotlin
list {
    section {
        title = "section"
        item {
            title = "item"
        }
    }
    section {
        title = "section"
        item {
            title = "item"
        }
        item {
            title = "item"
        }
    }
}
```
