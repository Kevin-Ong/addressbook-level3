package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

//Not sure if I'm correct, but I intepret this as a "fake" StorageFile class that does nothing, so as to test if the Logic class is working properly

public class StorageStub extends Storage{
    public StorageStub() {
    }
    
    public void save(AddressBook addressBook) throws StorageOperationException {
        return;
    }
    
    public AddressBook load() {
        return AddressBook.empty();
    }
    
    public String getPath() {
        return "";
    }
}
