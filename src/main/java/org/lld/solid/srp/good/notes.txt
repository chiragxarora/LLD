A class should have only one reason to change,
meaning it should have only one responsibility

Example: A User class should only handle user related logic,
while db related operations should be handled by a separate
UserRepository class, other services like email/notification
should have separate classes