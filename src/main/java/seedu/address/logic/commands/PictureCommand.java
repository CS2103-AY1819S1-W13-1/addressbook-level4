package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_FILE_LOCATION;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.CommandHistory;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.Picture;

//@@author denzelchung
/**
 * Adds a picture to a contact in the address book.
 */
public class PictureCommand extends Command {

    public static final String COMMAND_WORD = "pic";
    public static final String COMMAND_ALIAS = "p";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds a picture to a contact in the address book "
        + "by the index number used in the displayed person list.\n"
        + "Parameters: INDEX (must be a positive integer) "
        + PREFIX_FILE_LOCATION + "FILE_LOCATION\n"
        + "Example: " + COMMAND_WORD + " 1 "
        + PREFIX_FILE_LOCATION + "/images/johndoe.jpg";

    public static final String MESSAGE_SUCCESS = "Added picture for Person: %1$s";
    public static final String MESSAGE_INVALID_PICTURE = "The image file could not be found.";

    private final Index index;
    private final Picture picture;

    /**
     * @param index of the person in the filtered person list to edit
     * @param picture of the profile picture
     */
    public PictureCommand(Index index, Picture picture) {
        requireNonNull(index);
        requireNonNull(picture);

        this.index = index;
        this.picture = picture;
    }

    @Override
    public CommandResult execute(Model model, CommandHistory history) throws CommandException {
        return new CommandResult(String.format(MESSAGE_SUCCESS, index));
    }
}
