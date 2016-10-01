package seedu.addressbook.storage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Path;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.storage.StorageFile.StorageOperationException;
import seedu.addressbook.storage.jaxb.AdaptedAddressBook;

public abstract class Storage {
    
    /**
     * Saves all data to this storage location (txt file, SQL Database, XML file etc).
     *
     * @throws StorageOperationException if there were errors converting and/or storing data to file.
     */
    protected abstract void save(AddressBook addressBook) throws StorageOperationException;

    /**
     * Loads data from this storage location.
     *
     * @throws StorageOperationException if there were errors reading and/or converting data from file.
     */
    protected abstract AddressBook load() throws StorageOperationException;
}
