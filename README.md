![GitHub all releases](https://img.shields.io/github/downloads/CoolDuderCoder/MathJUtil/total?logo=GitHub)
![GitHub contributors](https://img.shields.io/github/contributors/CoolDuderCoder/MathJUtil?logo=GitHub)
![GitHub License](https://img.shields.io/github/license/CoolDuderCoder/MathJUtil?logo=GitHub)
![GitHub issues](https://img.shields.io/github/issues/CoolDuderCoder/MathJUtil?logo=GitHub)


# MathJUtil

This Project Is A Math Library Project For The Purpose Of Making Math An Easy Task

This Project Has Been Written In A Static Way.

## How To Do Vector Arthimetic
Vector Arthimetic Might Be One Of Those Things That Developers Are Most Intrested In And Are Used The Most Accross Developers.

The Way To Add To Vectors In MathJUtil Is Shown Below



	public static void main(String[] args) {
		Vector2f a = new Vector2f(10, 10);
		Vector2f b = new Vector2f(10, 10);
		Vector2f result = new Vector2f();
		
		result = Vector2f.add(a, b);
		
		System.out.println(Vector2f.toString(result));
	}

output (20, 20)

Another Thing To Note Is That It Was Written This Way To Make Understanding Whats Happening With Your Code Much Easier When It Comes To Any Operation And Making Sense Of How Things Work.
