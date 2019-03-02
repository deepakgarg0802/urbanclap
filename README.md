# Urban clap Application

## Problem statement:

Create a urban clap like system where a user can come and register for a task. Consumer will be able
to consume those tasks

Marketplace which connects freelance labor (service experts) with consumers to do tasks.

Example: consumer makes a request for cleaning; cleaner gets a request and accepts or rejects it.

Sign in / Sign up (w/ email) for users. 2 different modes: Worker Mode and Consumer Mode. 


Worker Mode

* Sees the list of all incoming tasks (inbox)

* Can filter tasks by category

* Can sort tasks by proximity (distance to task)

* Gets the notification about the task. For every task he can accept or reject it.

* Once the task is complete, I can mark it as a complete. 

* Once the task is complete, worker can rate the consumer on scale from 1 to 5.

* List of all my tasks: history of completed tasks, tasks which I accepted, but haven’t completed it 


Consumer Mode

* I can create a task. Each task should have name, description, category (from the list of categories), location (taken automatically), current date & time (automatic). 

* List of my tasks: tasks of completed tasks requested by me 

* Once the task is completed by the worker, I can rate him on scale from 1 to 5.

## Installation

- Install Spring Tool Suite, Maven and Java8
- Clone the project and import it as Maven project in Spring Tool Suite
- run `mvn clean install` inside project terminal

## Running App
- run project as Spring Boot Application
- open `http://localhost:8080/swagger-ui.html` in browser
- Enter Parameters in any Api
- Click on Try it Out

## Screenshots

![Api List](screenshots/apiList.PNG)
