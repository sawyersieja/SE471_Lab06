A system design in UML class diagram is shown below, where multiple notifications shown in a
NotificationBar may share the same attached files or media objects. A client (Demo) may take
two phases to initiate/use a NotificationCollection. In the first phase, the client may request the
NotificationCollection 10 times, each time to add/create one Notification (with different string
content). No attachment is associated with a Notification when it is created. In the second phase,
the client may request the NotificationCollection to link the 1st, 2nd, and 3rd Notification objects
to the same MediaAttachment object, and link 5th, 9th Notification objects to the same
FileAttachment object, etc.

1. What design pattern is used for the classes (interfaces) in green? [10 points]
2. What design pattern is used for the classes in blue? [10 points]
3. Implement the design in Java. You may add more attributes or operations to a class if needed.
Make sure all the relations are appropriately mapped into code. [80 points]

*See diagram in the doc*